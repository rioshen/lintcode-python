Implement Queue by Stacks
--------------------------------

> As the title described, you should only use two stacks to implement a queue's actions.

> The queue should support push(element), pop() and top() where pop is pop the first(a.k.a front) element in the queue.

> Both pop and top methods should return the value of first element.

> Example

> For `push(1)`, `pop()`, `push(2)`, `push(3)`, `top()`, `pop()`, you should return `1`, `2` and `2`

Solution
---------------

```python
class Queue:

    def __init__(self):
        self.stack1 = []
        self.stack2 = []
        
    def push(self, element):
        self.stack1.append(element)

    def top(self):
        if not self.stack2:
            while self.stack1:
                self.stack2.append(self.stack1.pop())
        return self.stack2[-1]

    def pop(self):
        if not self.stack2:
            while self.stack1:
                self.stack2.append(self.stack1.pop())
        return self.stack2.pop()
```
