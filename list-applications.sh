apps="/opt/payara5/bin/./asadminlist-applications"

for app in $apps
do
    if [ $app = "the_name_of_your_app" ]
    then
        /opt/payara5/bin/./asadmin undeploy the_name_of_your_app
    fi
done; 