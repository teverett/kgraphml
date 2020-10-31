package com.khubla.kgraphml;

import org.junit.jupiter.api.*;

import com.khubla.graphml.*;
import com.khubla.kgraphml.generated.*;

public class Test1 {
	@Test
	public void test11() {
		try {
			final GraphmlType graphmlType = new GraphmlType();
			GraphMLExporter.export(graphmlType, System.out);
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
