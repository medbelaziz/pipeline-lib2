#!/usr/bin/groovy
package com.orange

interface PipelineInterface {

	void prepare()

	void build()

	void logStart(String stageName)

	void logEnd(String stageName)
}
