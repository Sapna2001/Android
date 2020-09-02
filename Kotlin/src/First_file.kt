fun main() {
    var name = "Sapna";
    val suffix:Int = 2001; //changeable
    print("Hello, world ${name}${suffix}!!!");
	
	//arrays
	
	val names = arrayOf("Sap","Sanjay","Roopa");
	for(arrayname in names){
		println(arrayname);
	}
	names.forEach{
		print(it);
	}
	
	// if else
	
	val value: Int = if(true){
		print("Sapna");
		2001;
	}else{
		20;
	}
	println(value);
	
	// when
	
	when(name){
		"Sapna" -> {
			println("Awesome");
		}else -> {
			print("None");
		}
	}
	
	// range
	
	for(i in 0..5){
		println(i);
	}
	for(i in 0..5 step 2){
		println(i);
	}
	for(i in 3 downTo 0){
		println(i);
	}
	
	// in
	
	val x = 2;
	if(x in 1..5)
		print("present");
	else
		print("not present");
	
//	mutable list
	
	val listnames = mutableListOf("Sap","Sanjay","Roopa");
	listnames[0] = "Sapna";
	
//	functions
	
	print(operation(1,2));
	greetings(name="Sapna");
	
	// oops
	val p1 = Person("Sapna");
	print(p1.name);
	
	// list
	val list = listOf<Int>(1,4,3,2,0);
	val newList = list.filter({
		it %2 == 0;
	}).map({
        it*it
    }).
    forEach({
        println("$it")
    })
}

//functions

fun operation(a: Int, b: Int) : Int = a+b;

fun greetings(greet: String="GN",name:String){
	print("$name $greet");
}

// classs

class Person(val name:String){}
	
