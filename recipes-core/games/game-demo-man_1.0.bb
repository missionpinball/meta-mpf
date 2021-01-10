SUMMARY = "Demo Man MPF Example Game"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2fabdfe7c3cb0bb50248d803365b02e4"

PR = "1.0+git${SRCPV}"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/missionpinball/mpf-examples.git;protocol=git;branch=dev"
#SRC_URI = "git:///home/jan/src/mpf-examples;protocol=file;branch=dev"

S = "${WORKDIR}/git"

RDEPENDS_${PN} = "python3-mpf python3-mpf-mc"

FILES_${PN} = "/game/*"

do_compile() {
}

do_install() {
    install -d ${D}/game
    cp -R --no-dereference --preserve=mode,links ${S}/demo_man/* ${D}/game/
}
