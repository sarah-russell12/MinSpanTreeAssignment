package d_minSpanTree.controller.operation.algorithm;

import java.util.ArrayList;

import d_minSpanTree.model.Edge;
import d_minSpanTree.model.GraphModelInterface;

public class DelaunayTriangulation implements GraphAlgorithm {

	public void execute(GraphModelInterface gmi) {
		gmi.getEdges().clear();

		// TODO: the code here is not Delaunay triangulation.
		// TODO: (group assignment) modify below to get the code run faster
		long startTime = System.nanoTime(); // Start the total timing

		// TODO: Implement Bowyer-Watson
		// http://en.wikipedia.org/wiki/Bowyer%E2%80%93Watson_algorithm

		ArrayList<Edge> triangulation = new ArrayList<Edge>();
		// generate super-triangle and add to triangulation

		// for each point :
		// find all bad triangles (point is inside circumcircle of triangle)
		// add all edges to polygon that aren't shared by other bad triangles
		// remove all bad triangles from triangulation
		// add polygon triangles to triangulation

		// remove triangles that contain super-triangle vertex

		// for (int i0 = 0; i0 < gmi.getVertices().size(); i0++) {
		// for (int i1 = i0 + 1; i1 < gmi.getVertices().size(); i1++) {
		// Vertex v0 = gmi.getVertices().get(i0);
		// Vertex v1 = gmi.getVertices().get(i1);
		// Edge e = new Edge(v0, v1);
		// double dx = v1.getX() - v0.getX();
		// double dy = v1.getY() - v0.getY();
		// e.setWeight(dx * dx + dy * dy);
		// gmi.getEdges().add(e);
		// }
		// }

		long endTime = System.nanoTime(); // Finish the total timing
		float timeElapsed = (endTime - startTime) / 1000000.0f; // milliseconds
		System.out.println("Edge creation O(f(nE,nV)???):" + timeElapsed);
	}

	public String getName() {
		return "Connect All Vertices";
	}

	public boolean canLiveUpdate() {
		return true;
	}

}
