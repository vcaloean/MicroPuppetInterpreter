This is an Interpreter for the language of micro-Puppet.

For more information and to view syntactic and semantic rules, please visit https://arxiv.org/abs/1608.04999

First, run "./buildAntlr" to create the relevent files.

--- ANTLR ---
To run ANTLR on a puppet example, there are two options:

Option 1: (Single file - Image output)
Running "./runAntlr [relative/path/to/file]" will result in an image of the resulting Parse tree.

Option 2: (All files in examples - Text output)
Running "./runAntlr all" will result in all of the files in "examples/" to be used by ANTLR and the resulting parse trees will be output to the directory "output_ast_progression/" in a lisp-like format.

--- Interpreter ---
To run the Interpreter on a puppet example, there are two options:

Option 1: (Single file)
Running "./runInterpreter [relative/path/to/file]" will result in a catalog in the folder "output_catalogs". To see the AST evaluation and any errors, please view "output_ast_progression".

Option 2: (All files in examples)
Running "./runInterpreter all" will result in all of the files in "examples/" to be used by the Interpreter and the resulting catalogs will be in the folder "output_catalogs". To see the AST evaluations and any errors, please view "output_ast_progression".