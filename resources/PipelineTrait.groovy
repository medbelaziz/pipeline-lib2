#!/usr/bin/groovy

abstract class PipelineTrait implements PipelineInterface {

	@Override
	@NonCPS
	public void prepare() {
		def stageName = "Prepare"
		this.logStart(stageName)
		this.prepare()
		this.logEnd(stageName)
	}

	@Override
	@NonCPS
	public void build() {
		def stageName = "Build"
		this.logStart(stageName)
		this.build()
		this.logEnd(stageName)
	}

	@Override
	@NonCPS
	public void logStart(String stageName) {
		println(">>> logStart ***********************")
		println(">>> "+stageName)
	}

	@Override
	@NonCPS
	public void logEnd(String stageName) {
		println("<<< "+stageName)
		println("<<< logEnd ***********************")
	}
}
