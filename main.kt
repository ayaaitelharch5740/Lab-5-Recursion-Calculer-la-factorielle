// Lab Recursion  Factorielle et extensions

// -------------------------
// Version iterative
fun factorialIter(number: Int): Int {
    var result = 1
    for (i in 1..number) {
        result *= i
    }
    return result
}

// -------------------------
// Version recursive simple
fun factorialRecursive(number: Int): Int {
    if (number <= 1) return 1
    return factorialRecursive(number - 1) * number
}

// -------------------------
// Version recursive avec trace
fun factorialTrace(number: Int): Int {
    println("Appel factorialTrace($number)")
    if (number <= 1) {
        println("Cas de base atteint pour $number, retour 1")
        return 1
    }
    val result = factorialTrace(number - 1) * number
    println("Retour de factorialTrace($number) = $result")
    return result
}

// -------------------------
// Version securisee (negatifs)
fun factorialSafe(number: Int): Int {
    if (number < 0) {
        println("Factorielle non definie pour les nombres negatifs: $number")
        return 0
    }
    if (number <= 1) return 1
    return factorialSafe(number - 1) * number
}

// -------------------------
// Somme de 1 à n recursive
fun sumTo(n: Int): Int {
    if (n <= 1) return n
    return sumTo(n - 1) + n
}

// -------------------------
// Puissance recursive
fun power(base: Int, exponent: Int): Int {
    if (exponent == 0) return 1
    return base * power(base, exponent - 1)
}

// -------------------------
// Programme principal
fun main() {
    println("=== Lab Recursion – Factorielle ===")

    println("=== Version iterative ===")
    println("factorialIter(1) = ${factorialIter(1)}")
    println("factorialIter(4) = ${factorialIter(4)}")
    println("factorialIter(5) = ${factorialIter(5)}")

    println("\n=== Version recursive ===")
    println("factorialRecursive(4) = ${factorialRecursive(4)}")
    println("factorialRecursive(5) = ${factorialRecursive(5)}")

    println("\n=== Trace recursive ===")
    val r = factorialTrace(4)
    println("Resultat final = $r")

    println("\n=== Version securisee ===")
    println("factorialSafe(-3) = ${factorialSafe(-3)}")
    println("factorialSafe(0) = ${factorialSafe(0)}")

    println("\n=== Somme de 1 a n ===")
    println("sumTo(5) = ${sumTo(5)}")  // 1+2+3+4+5 = 15
    println("\n=== Puissance recursive ===")
    println("power(2, 5) = ${power(2, 5)}") // 2^5 = 32
}