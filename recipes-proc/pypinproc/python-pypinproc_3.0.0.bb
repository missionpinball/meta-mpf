DESCRIPTION = "Python pypinproc"
SECTION = "libs"
HOMEPAGE = "https://github.com/missionpinball/pypinproc"
LICENSE = "MIT"
DEPENDS = "python libpinproc libusb-compat"
RDEPENDS_${PN} += "python"
SRCNAME = "python-pypinproc"
PR = "r1"

LIC_FILES_CHKSUM = "file://README.md;md5=3169a51580b5660ea652ad99b5c3e64f"

SRC_URI = "git://github.com/missionpinball/pypinproc.git;protocol=git;tag=71ad50c3dfdf13c963497def8cd3777b00c25aec"
S = "${WORKDIR}/git"

inherit setuptools
