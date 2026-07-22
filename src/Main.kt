fun main (){
    println("========== Calculator ==========")



    var isRunning = true

    while (isRunning) {

        println("\n1. Calculate\n" +
                "\n" +
                "2. Exit")
        val choice = readln().toInt()

        when(choice){
            1 -> {
                println("Enter First Number")

                val num1 = readln().toDouble()

                println("Enter operator (+, -, *, /): ")
                val operator = readln()

                println("Enter Second Number")
                val num2 = readln().toDouble()

                var result =0.0

                when(operator){
                    "+" -> {
                        result = num1+ num2
                    }
                    "-" ->{
                        result = num1-num2
                    }
                    "*" ->{
                        result = num1*num2
                    }
                    "/" ->{
                        result = num1/num2
                    }
                    else -> println("Invalid operator")
                }



                println("Result: $result")
            }
            2 ->{
                isRunning = false
                println("Exited")
            }
            else -> println("Invalid operator")
        }
    }





}