#solving tree problems
'''
always recursive
find base case
    leaf or null
find inductive step
'''

'''
EXAMPLE:

'Given the root to a binary tree, count the total number of nodes there are.'
def count(node):
  return count(node.left) + count(node.right) + 1 if node else 0
'''

'''
Harder Example:
'Given the root to a binary tree, return the deepest node.'