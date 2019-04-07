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
base case = null

def count(node):
  return count(node.left) + count(node.right) + 1 if node else 0
'''

'''
Harder Example:
    'Given the root to a binary tree, return the deepest node.'

base case can't be null
recurse left or right depending on what is deeper (not null)
continue to increment the depth 
then compare the two 'deepest' nodes of each side

def deepest(node):
    if node and not node.left and not node.right:
        return (node, 1) # Leaf and its depth

    if not node.left: # Then the deepest node is on the right subtree
        return increment_depth(deepest(node.right))
    elif not node.right: # Then the deepest node is on the left subtree
        return increment_depth(deepest(node.left))

    return increment_depth(
            max(deepest(node.left), deepest(node.right),
                    key=lambda x: x[1])) # Pick higher depth tuple and then increment its depth

def increment_depth(node_depth_tuple):
    node, depth = node_depth_tuple
    return (node, depth + 1)

'''