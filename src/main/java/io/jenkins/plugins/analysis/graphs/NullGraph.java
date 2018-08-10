package io.jenkins.plugins.analysis.graphs;

/**
 * Empty graph. Null object: this graph does not render anything. Additionally,
 * there is no enable graph link presented in the UI.
 *
 * @author Ullrich Hafner
 */
public class NullGraph extends EmptyGraph {
    @Override
    public String getId() {
        return "NULL";
    }

    @Override
    public boolean isDeactivated() {
        return true;
    }

    @Override
    public boolean isSelectable() {
        return false;
    }
}

