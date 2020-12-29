DESCRIPTION = "Python libSDL Bindings"
SECTION = "devel/python"
HOMEPAGE = "http://www.pygame.org"
LICENSE = "LGPL-2.1+"
DEPENDS = "virtual/libsdl2 libsdl2-image libsdl2-mixer libsdl2-net libsdl2-ttf python-numeric freetype"
RDEPENDS_${PN} += "python-numeric python"
SRCNAME = "pygame"
PR = "r1"

LIC_FILES_CHKSUM = "file://README.rst;md5=790eebcf0322f21f74a6cc58c41808a2"

SRC_URI = "git://github.com/pygame/pygame.git;protocol=git;tag=${PV};nobranch=1"
S = "${WORKDIR}/git"

inherit setuptools

do_configure_prepend() {
	# Drop options to replace them later and drom pypm as we don't have portmidi/porttime
	sed 's@^SDL =.*$@SDL = '"`pkg-config --cflags --libs sdl2`"'@g; s@^FREETYPE =.*$@FREETYPE = '"`pkg-config --cflags --libs freetype2`"'@g; /^pypm src/d' buildconfig/Setup.SDL2.in > Setup
}
