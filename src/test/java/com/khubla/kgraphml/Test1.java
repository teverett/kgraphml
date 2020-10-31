package com.khubla.kgraphml;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

import org.junit.jupiter.api.*;

import com.khubla.graphml.*;
import com.khubla.kgraphml.generated.*;

public class Test1 {
	@Test
	public void test11() {
		try {
			final GraphmlType graphmlType = new GraphmlType();
			/*
			 * marshall
			 */
			final ByteArrayOutputStream baos = new ByteArrayOutputStream();
			GraphMLMarshaller.exportGraph(graphmlType, baos);
			final String marshalled = baos.toString();
			/*
			 * unmarshall
			 */
			final ByteArrayInputStream bais = new ByteArrayInputStream(marshalled.getBytes());
			final GraphmlType graphmlType2 = GraphMLMarshaller.importGraph(bais);
			assertNotNull(graphmlType2);
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
