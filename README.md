# Circle Game with Children

### Design
A double-linked circular list is used to represent the children circle. It allows O(1) for removing a child from the circle.

### Efficiency
The game order of complexity is O(n) - n times k at worst. Each removal from the circle is O(1).
In terms of memory, there are 2 links on each node, which uses a bit more memory. But it allows the removal to be O(1) and the logic is very straightforward.

### Execution
It is  a Sprinboot console application that can be run with the command:

`gradlew bootRun -Pargs=8,3`

where n = 8 and k = 3
By default n=10 and k=3.