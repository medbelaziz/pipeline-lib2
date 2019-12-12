#!/usr/bin/groovy

interface PipelineInterface {

	void prepare()

	void build()

	void logStart(String stageName)

	void logEnd(String stageName)
}
