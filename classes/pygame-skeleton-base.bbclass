inherit core-image features_check

IMAGE_FEATURES += "splash"

REQUIRED_DISTRO_FEATURES = "x11"

QB_MEM = '${@bb.utils.contains("DISTRO_FEATURES", "opengl", "-m 512", "-m 256", d)}'

CORE_IMAGE_EXTRA_INSTALL += " python python-datetime python-io python-core python-misc python-pygame python-pypinproc python-pyyaml python-imaging packagegroup-core-x11-xserver packagegroup-core-x11-utils matchbox-wm"

