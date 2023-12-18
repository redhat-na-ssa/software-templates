# Software Templates

Collection of Software Templates / Golden Path for Red Hat Developer Hub.

## GitOps and Secret Management

Some of the Templates available in this collection relies on [**Hashicorp Vault**](https://www.vaultproject.io/) to manage Secrets (eg. Github and Quay access tokens). 

Two additional Secret Engine plugins are required to be installed and enabled on Vault Server:

 * [vault-plugin-secrets-github](https://github.com/martinbaillie/vault-plugin-secrets-github)
 * [vault-plugin-secrets-quay](https://github.com/redhat-cop/vault-plugin-secrets-quay/)

These Secret Engines can create access tokens dynamically on Github and Quay using its APIs and store them in Vault.

In order to automate secrets provisioning these templates generates Custom Resources (CRDs) that requires the following Operators to be present in the cluster where the application gets deployed to:

 * [Vault Config Operator](https://github.com/redhat-cop/vault-config-operator)
 * [Git Webhook Operator](https://github.com/redhat-cop/gitwebhook-operator)

## Sandbox cluster setup with Developer Hub and Hashicorp Vault

You can setup a `RHDH + Hashicorp Vault` environment on your **sandbox cluster** using [**this repo here**]( https://github.com/redhat-na-ssa/redhat-developer-hub-gitops-bootstrap.git ). This repo contains a ArgoCD app which install all the components needed to use these software templates. I also contains a Ansible playbook to install RHDH and configure Vault.

## Using templates without Secret Management

If you don't have Hashicorp Vault setup on your environment you can switch over to the `no-vault` branch which does not use Vault integration.

## Using the Template Editor UI

While implementing or customizing your own Software Template you can leverage 
the Template functionality available in the UI. See below how to access it.

![Backstage Template editor](docs/backstage-template-editor.gif "Template Editor")

> NOTE: make sure you choose 'Load from a directory' to load this git repo from your local file system and point it to the root of this repo. Any change you make using the web editor will base saved only in your file system.