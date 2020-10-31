package com.khubla.graphml;

import java.io.*;

import javax.xml.bind.*;

import com.khubla.kgraphml.generated.*;

public class GraphMLExporter {
	public static void export(GraphmlType graphmlType, OutputStream outputStream) throws IOException, JAXBException {
		if (null != graphmlType) {
			final JAXBContext jc = JAXBContext.newInstance("com.khubla.graphml.generated");
			final Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			/*
			 * marshal
			 */
			final ObjectFactory objectFactory = new ObjectFactory();
			final JAXBElement<GraphmlType> je = objectFactory.createGraphml(graphmlType);
			marshaller.marshal(je, outputStream);
		}
	}
}
