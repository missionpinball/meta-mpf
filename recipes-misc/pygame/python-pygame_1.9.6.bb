DESCRIPTION = "Python libSDL Bindings"
SECTION = "devel/python"
HOMEPAGE = "http://www.pygame.org"
LICENSE = "LGPL-2.1+"
DEPENDS = "virtual/libsdl libsdl-image libsdl-mixer libsdl-net libsdl-ttf python-numeric freetype"
RDEPENDS_${PN} += "python-numeric python"
SRCNAME = "pygame"
PR = "r1"
#HOSTTOOLS += "sdl_config"
ASSUME_PROVIDED += "libsdl-native"

LIC_FILES_CHKSUM = "file://README.rst;md5=fd2368c1c1a9ee1bc368d6c8137b09aa"

SRC_URI = "git://github.com/pygame/pygame.git;protocol=git;tag=${PV};nobranch=1"
S = "${WORKDIR}/git"

#inherit distutils
inherit setuptools

do_configure_prepend() {
	# Drop options to replace them later and drom pypm as we don't have portmidi/porttime
	sed '/^SDL =/d; /^pypm src/d; /^_freetype/d' buildconfig/Setup.SDL1.in > Setup
	SDL="`pkg-config --cflags --libs sdl`"; echo "SDL=$SDL" >>Setup
}
