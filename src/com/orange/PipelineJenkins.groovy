#!/usr/bin/groovy
package com.orange

class PipelineJenkins extends PipelineTrait{

	PipelineJenkins(){
		this._prepare()
		this._build()
	}
	
}
