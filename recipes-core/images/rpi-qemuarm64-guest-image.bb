require recipes-core/images/core-image-base.bb
require recipes-graphics/images/core-image-weston.bb

SUMMARY = "The test image running on qemuarm64 with kvm"

LICENSE = "MIT"

# compatible machines
MACHINEOVERRIDES =. "rpi-qemuarm64:"
MACHINEOVERRIDES =. "rpi-qemuarm64-guest:"

# Features and packages
REQUIRED_DISTRO_FEATURES = "wayland opengl systemd"

DISTRO_FEATURES_append = " wayland opengl systemd"

IMAGE_INSTALL_append = " android-tools"

# Image fs types
IMAGE_FSTYPES = " ext4"
