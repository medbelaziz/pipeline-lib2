#!/usr/bin/groovy
package com.orange

abstract class PipelineTrait implements PipelineInterface {

	@Override
	public void prepare() {
		def stageName = "Prepare"
		this.logStart(stageName)
		this.prepare()
		this.logEnd(stageName)
	}

	@Override
	public void build() {
		def stageName = "Build"
		this.logStart(stageName)
		this.build()
		this.logEnd(stageName)
	}

	@Override
	public void logStart(String stageName) {
		echo ">>> logStart ***********************"
		echo ">>> "+stageName
	}

	@Override
	public void logEnd(String stageName) {
		echo "<<< "+stageName
		echo "<<< logEnd ***********************"
	}
}
