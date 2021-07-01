#!/bin/bash
  
#NAMEMVC=tutorials
#NAMESPACE=integration
#IMAGENAME=registry.local/msa/tutorials
#IMAGETAG=2
#WEB_LOCATION=tutorials
#KUBECONFIG=staging


/usr/local/bin/helm install $NAMEMVC  --namespace=$NAMESPACE --set image.repository=$IMAGENAME --set image.tag=$IMAGETAG $WEB_LOCATION --kubeconfig ${KUBECONFIG}

if [ $? -eq 1 ]
then
echo "## Application might be exists. running upgrade command"
/usr/local/bin/helm upgrade $NAMEMVC  --namespace=$NAMESPACE --set image.repository=$IMAGENAME --set image.tag=$IMAGETAG $WEB_LOCATION --kubeconfig ${KUBECONFIG}
echo  "$?"
        if [ $? -ne 0 ]
        then
                echo "helm installation failed..."
                exit 1
        fi
fi
