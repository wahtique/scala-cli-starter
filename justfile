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
lint *flags: (_cli 'fmt' flags )

#
# aliases
#
alias b := build
alias r := run
alias t := test
alias fmt := lint