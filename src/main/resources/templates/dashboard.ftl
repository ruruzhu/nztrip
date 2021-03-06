<!DOCTYPE html>
<html lang="en">
<head>
<#include "head.ftl"/>
</head>

<body>
<#include "navigation.ftl"/>

<div class="container-fluid">
    <div class="row">
    <#include "menu.ftl"/>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <div>
                <table class="table table-hover">
                    <thead>
                    <tr>
                        <th>编号</th>
                        <th>名称</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <#if hotItems?exists>
                        <#list hotItems as hotItem>
                        <tr>
                            <td>${hotItem.skuUuid!''}</td>
                            <td>${hotItem.sku!''}</td>
                            <td>
                                <div>
                                    <a href="${hotItem.createOrderUrl!''}">直接下单</a>
                                </div>
                                <#if (hotItem.lookupUrl?? && hotItem.lookupUrl != "")>
                                    <div>
                                        <a href="${hotItem.lookupUrl!''}">官网查位</a>
                                    </div>
                                </#if>
                            </td>
                        </tr>
                        </#list>
                    </#if>
                    </tbody>
                </table>

            </div>
        </div>
    </div>
</div>

<#include "third_party_file.ftl"/>
</body>
</html>
