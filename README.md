# Software Templates

Collection of Software Templates / Golden Path for Red Hat Developer Hub.

> NOTE: some of the of the Templates available in this collection relies on Hashicorp Vault to manage Secrets (eg. Github and Quay tokens). In order to automate the secrets provisioning these templates generates some Custom Resources (CRDs) that requires the following Operators to be present in the cluster where the application gets deployed to:

> * [Vault Config Operator](https://github.com/redhat-cop/vault-config-operator)
> * [Git Webhook Operator](https://github.com/redhat-cop/gitwebhook-operator)

> If you don't have Hashicorp Vault setup on your environment you can switch over to the `no-vault` branch which does not use Vault integration.