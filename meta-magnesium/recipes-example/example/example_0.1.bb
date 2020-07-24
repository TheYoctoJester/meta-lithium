SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"

FOOBAR = "asdf"

inherit foobar

FOOBAR_append_qemux86-64 = " x86-64"
FOOBAR_append_poky = " poky"
FOOBAR_append_qemux86-64_poky = " x86-64-poky"

#FOOBAR_append = "app1"

#FOOBAR_prepend = "pre1"

#FOOBAR += "exp1"

#FOOBAR =+ "exp2"

FOOBAR_remove = "poky"

python do_build() {
    bb.plain("***********************************************");
    bb.plain("*                                             *");
    bb.plain("*  Example recipe created by bitbake-layers   *");
    bb.plain("*                                             *");
    bb.plain("***********************************************");
}
