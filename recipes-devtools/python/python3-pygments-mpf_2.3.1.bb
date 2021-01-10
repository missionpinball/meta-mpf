SUMMARY = "Pygments is a syntax highlighting package written in Python."
DESCRIPTION = "Pygments is a syntax highlighting package written in Python."
HOMEPAGE = "http://pygments.org/"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=055b5a1a8d44f400965c04fa10a51596"

PYPI_PACKAGE = "pygments"

inherit setuptools3
SRC_URI[md5sum] = "b7d04e2cd87c405938f1e494e2969814"
SRC_URI[sha256sum] = "5ffada19f6203563680669ee7f53b64dabbeb100eb51b61996085e99c03b284a"

DEPENDS += "\
            ${PYTHON_PN} \
            "

PYPI_PACKAGE = "Pygments"

inherit pypi

BBCLASSEXTEND = "native nativesdk"

