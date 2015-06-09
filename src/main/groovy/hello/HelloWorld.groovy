package hello

class HelloWorld {
	static void main(def args) {
		def myList = [1, 2, "Lars", "4"]
		myList.each { println it }

		def greeter = new Greeter()
		greeter.greet()

		def car = new Car(2015, 10000)
		println 'This new car is a ' + car.year + ' model.'
		println 'And it has ' + car.miles + ' miles.'
	}
}