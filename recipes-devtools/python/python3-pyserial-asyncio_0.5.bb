SUMMARY = "Async Serial Port Support for Python"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6beb1577c3b30e61130c8e748689b62d"

SRC_URI[md5sum] = "64d15bfb20982b2129b02070321f49f3"
SRC_URI[sha256sum] = "1641e5433a866eeaf6464b3ab88b741e7a89dd8cd0f851b3343b15f425138d33"

inherit pypi setuptools3 ptest

BBCLASSEXTEND = "native nativesdk"

SRC_URI += " \
	file://run-ptest \
"

RDEPENDS_${PN}-ptest += " \
	${PYTHON_PN} \
"

do_install_ptest() {
	install -d ${D}${PTEST_PATH}/test
	cp -rf ${S}/test/* ${D}${PTEST_PATH}/test/
}
