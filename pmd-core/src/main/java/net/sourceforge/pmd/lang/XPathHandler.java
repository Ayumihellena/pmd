/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang;

import org.jaxen.Navigator;

import net.sourceforge.pmd.Rule;
import net.sourceforge.pmd.annotation.InternalApi;
import net.sourceforge.pmd.lang.xpath.Initializer;

import net.sf.saxon.sxpath.IndependentContext;

/**
 * Interface for performing Language specific XPath handling, such as
 * initialization and navigation.
 */
@InternalApi
@Deprecated
public interface XPathHandler {

    XPathHandler DUMMY = new XPathHandler() {
        @Override
        public void initialize() {
            // empty handler - does nothing
        }

        @Override
        public void initialize(IndependentContext context) {
            // empty handler - does nothing
        }

        @Override
        public Navigator getNavigator() {
            return null;
        }
    };

    Rule newXPathRule()

    /**
     * Initialize. This is intended to be called by {@link Initializer} to
     * perform Language specific initialization.
     *
     * @deprecated Jaxen support will be removed in 7.0.0
     */
    @Deprecated
    void initialize();

    /**
     * Initialize. This is intended to be called by {@link Initializer} to
     * perform Language specific initialization for Saxon.
     *
     * @deprecated Internal API
     */
    @Deprecated
    void initialize(IndependentContext context);

    /**
     * Get a Jaxen Navigator for this Language. May return <code>null</code> if
     * there is no Jaxen Navigation for this language.
     *
     * @deprecated Support for Jaxen will be removed come 7.0.0
     */
    @Deprecated
    Navigator getNavigator();
}
