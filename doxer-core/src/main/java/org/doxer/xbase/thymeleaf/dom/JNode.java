package org.doxer.xbase.thymeleaf.dom;

import org.thymeleaf.dom.Node;

public abstract class JNode {
	
	protected Node node;
	
	JNode(Node node) {
		this.node = node;
	}
	
	public Node toNode() {
		return node;
	}

}
