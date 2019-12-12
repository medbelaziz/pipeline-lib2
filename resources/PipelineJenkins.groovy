#!/usr/bin/groovy

class PipelineJenkins extends PipelineTrait{

	PipelineJenkins(){
		
	}
	def exec(){
		this.prepare()
		this.build()
	}
	
}
