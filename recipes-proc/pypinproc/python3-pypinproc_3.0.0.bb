DESCRIPTION = "Python3 pypinproc"
SECTION = "libs"
HOMEPAGE = "https://github.com/missionpinball/pypinproc"
LICENSE = "MIT"
DEPENDS = "python3 libpinproc libusb-compat"
RDEPENDS_${PN} += "python3"
SRCNAME = "python3-pypinproc"
PR = "r1"

LIC_FILES_CHKSUM = "file://README.md;md5=3169a51580b5660ea652ad99b5c3e64f"

SRC_URI = "git://github.com/missionpinball/pypinproc.git;protocol=git;tag=34c55c4d0aeec1f61286fc8d19f3f220a84465ef"
S = "${WORKDIR}/git"

inherit setuptools3

