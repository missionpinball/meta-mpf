SUMMARY = "Pure-python wrapper for libusb-1.0"
HOMEPAGE = "http://github.com/vpelletier/python-libusb1"
LICENSE = "LGPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=4fbd65380cdd255951079008b364516c"
DEPENDS += " libusb1"

PYPI_PACKAGE = "libusb1"

# use master because they fixed a dependency issue
SRC_URI = "git://github.com/vpelletier/python-libusb1.git;protocol=git;tag=1540f61e50fed356edfca7f4c0d9504a761a7384"
S = "${WORKDIR}/git"

SRC_URI[md5sum] = "4cd272e57d1001e7f0be210f8fee755f"
SRC_URI[sha256sum] = "d03ef15248c8b8ce440f6be4248eaadc074fc2dc5edd36c48e6e78eef3999292"

inherit setuptools
