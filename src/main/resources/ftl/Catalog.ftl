<!DOCTYPE html>
<html lang="en-US">
<head>
    <title>Catalogue items</title></head>
<body>
<main>
    <h2>Catalog: ${catalogName}</h2>

    <div>
        <h3>The catalog's path is:${catalogPath}</h3>
        <h3>It has the following items:</h3>
        <ul>
            <#list itemsList as item>
                <li class="item">
                    <p>Item id: ${item.id}</p>
                    <p>Item name: ${item.name}</p>
                </li>
            </#list>
        </ul>
    </div>

</main>

</body>
</html>