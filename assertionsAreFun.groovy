// Exploring assert in simple cases

println("First, we'll assert true. This shouldn't display anything.")
assert (true)
println ("Next, we'll assert 1 == 1, followed by assert 1 == 2.")
assert 1 == 1
assert 1 == 2
println("Okay, more fun. we'll declare a variable x, and assign it 1.")
def x = 1
assert x == 1
println("I'll assert that x == 2, and watch that blow up!")
assert x == 2

println("Finally, let's declare a variable and then assert it in one line.")
def y = 1; assert y == 1
