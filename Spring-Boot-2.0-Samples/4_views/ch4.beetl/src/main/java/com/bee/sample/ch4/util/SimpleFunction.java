package com.bee.sample.ch4.util;

import java.io.IOException;

import org.beetl.core.Context;
import org.beetl.core.Function;
import org.springframework.stereotype.Component;

@Component
public class SimpleFunction implements Function {

	public Object call(Object[] paras, Context ctx) {
		return "hi";
	}

}
