#
# KISS-DRY 
#
_cli cmd *flags:
    scala-cli {{cmd}} . {{flags}}

#
# recipes
#
build *flags: (_cli 'compile' flags)
run *flags: (_cli 'run' flags)
test *flags: (_cli 'test' flags)
fix *flags:
    scala-cli fix . --power --enable-built-in=false --semanticdb {{flags}}
fmt *flags: (_cli 'format' flags )
lint: fmt fix
package *flags : (_cli 'package' flags)

#
# aliases
#
alias b := build
alias r := run
alias t := test
alias p := package
alias l := lint