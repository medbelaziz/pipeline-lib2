def call(Map stageParams) {
	always { echo 'One way or another, I have finished' }
	success { echo 'I succeeeded!' }
	unstable { echo 'I am unstable :/' }
	failure { echo 'I failed :(' }
	changed { echo 'Things were different before...' }
}