SUMMARY = "Python module to control WS281x LEDs on a Raspberry Pi"
HOMEPAGE = "https://github.com/jgarff/rpi_ws281x/"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9dcf340793a1d73c5211edc8238767dc"
DEPENDS += " swig-native"

PYPI_PACKAGE = "rpi_ws281x"

S = "${WORKDIR}/git"

SRC_URI[sha256sum] = "4e1d5149343fe0885797363e1b78bbb4ea3888fc4204c0c75f91c4f0dcbb231d"

inherit scons setuptools pypi
