/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.util.viewer.gui.menu;

import javax.swing.JPopupMenu;

import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.util.viewer.model.ViewerModel;

/**
 * context sensitive menu for the AST Panel
 *
 * @author Boris Gruschko ( boris at gruschko.org )
 * @version $Id$
 */
@Deprecated // to be removed with PMD 7.0.0
public class ASTNodePopupMenu extends JPopupMenu {
    private ViewerModel model;
    private Node node;

    public ASTNodePopupMenu(ViewerModel model, Node node) {
        this.model = model;
        this.node = node;
        init();
    }

    private void init() {
        add(new SimpleNodeSubMenu(model, node));
        addSeparator();
        add(new AttributesSubMenu(model, node));
    }
}
