/*
 * Copyright 2013-2015, Teradata, Inc. All rights reserved.
 */
package com.teradata.benchmark.driver;

public class BenchmarkExecutionException
        extends RuntimeException
{

    public BenchmarkExecutionException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
