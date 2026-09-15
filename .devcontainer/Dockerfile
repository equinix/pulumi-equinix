FROM mcr.microsoft.com/devcontainers/base:ubuntu

# Install mise
ENV MISE_VERSION=2026.3.7
RUN curl https://mise.run | sh
ENV PATH="/root/.local/bin:${PATH}"

# Setup mise
WORKDIR /code
RUN mise install

# Activate mise in shell
RUN echo 'eval "$(mise activate bash)"' >> ~/.bashrc
