package com.coconut.boot.batch;

import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;

public class Writer implements ItemWriter<String> {

	@Override
	public void write(Chunk<? extends String> items) throws Exception {
		System.out.println("Inside Writer");
		System.out.println();
		
	}


}
