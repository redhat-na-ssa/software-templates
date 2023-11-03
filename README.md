# Software Templates

Collection of Software Templates / Golden Path for Red Hat Developer Hub.

> NOTE: some of the Templates available in this collection relies on [**Hashicorp Vault**](https://www.vaultproject.io/) to manage Secrets (eg. Github and Quay tokens). 

Two additional plugins are required to be installed and enabled in your Vault Server:

 * [vault-plugin-secrets-github](https://github.com/martinbaillie/vault-plugin-secrets-github)
 * [vault-plugin-secrets-quay](https://github.com/redhat-cop/vault-plugin-secrets-quay/)

In order to automate the secrets provisioning these templates generates some Custom Resources (CRDs) that requires the following Operators to be present in the cluster where the application gets deployed to:

 * [Vault Config Operator](https://github.com/redhat-cop/vault-config-operator)
 * [Git Webhook Operator](https://github.com/redhat-cop/gitwebhook-operator)

The Custom Resources in these templates also expect the following secrets to be present in your Vault instance

```
path: kv/secrets/janusidp/github-plugin
data:
  app_id: '...' 
  org: '...'
  private_key: '...'
```

and 

```
path: secrets/{{ rhdh_instance_name }}/registry
data:
  credentials: '...'
  user: '...'
  token: '...'
```

> If you don't have Hashicorp Vault setup on your environment you can switch over to the `no-vault` branch which does not use Vault integration.