class myClass {
	// Property (data member)
	private var name: String = "Vaibhav Mojidra"

	fun setName(name: String) {
		this.name = name
	}

	// Member function
	fun printName() {
		println("Name: $name")
	}
}

fun main(args: Array<String>) {
	val obj1 = myClass() // Create object obj of myClass class
	obj1.setName("Vaibhav Mojidra")
	obj1.printName() // Call a member function using object

	val obj2 = myClass() // Create object obj of myClass class
	obj2.setName("Vaibhav Mojidra 2")
	obj2.printName() // Call a member function using object
}