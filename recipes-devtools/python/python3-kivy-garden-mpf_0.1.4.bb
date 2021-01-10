SUMMARY = "kivy garden tool"

PYPI_PACKAGE = "kivy-garden"

DEPENDS = "python3"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=224aa9310bff59d7e9d60d3cdef99f97"
RDEPENDS_${PN} += "python3 python3-requests"

inherit pypi setuptools3

S = "${WORKDIR}/garden-${PV}"
 
SRC_URI[md5sum] = "069b94c5a05e5b018ee7e7c2f10630db"
SRC_URI[sha256sum] = "c256f42788421273a08fbb0a228f0fb0e80dd86b629fb8c0920507f645be6c72"

