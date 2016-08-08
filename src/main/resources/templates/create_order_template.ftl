<div class="form-group"><label>订单详情</label></div>
<div class="form-group"><label>名称:</label><span>   ${sku.name}</span></div>

<div class="form-group"><label>主要联系人</label></div>
<div class="form-group">
    <table class="table">
        <thead>
        <tr>
            <th><input type="text" id="j_primary_contact" class="form-control" placeholder="姓名"/></th>
            <th><input type="text" id="j_primary_contact_email" class="form-control" placeholder="Email"/></th>
            <th><input type="text" id="j_primary_contact_phone" class="form-control" placeholder="联系电话"/></th>
            <th><input type="text" id="j_primary_contact_wechat" class="form-control" placeholder="微信"/></th>
        </tr>
        </thead>
    </table>
</div>
<div class="form-group"><label>备用联系人</label></div>
<div class="form-group">
    <table class="table">
        <thead>
        <tr>
            <th><input type="text" id="j_secondary_contact" class="form-control" placeholder="姓名"/></th>
            <th><input type="text" id="j_secondary_contact_email" class="form-control" placeholder="Email"/></th>
            <th><input type="text" id="j_secondary_contact_phone" class="form-control" placeholder="联系电话"/></th>
            <th><input type="text" id="j_secondary_contact_wechat" class="form-control" placeholder="微信"/></th>
        </tr>
        </thead>
    </table>

</div>
<div class="form-group"><input type="text" id="j_remark" class="form-control"
                               placeholder="备注">
</div>
<div class="form-group">
    <button id="j_submit" class="btn btn-default">提交</button>
</div>


<div class="form-group"><label>游客信息</label></div>
<div class="form-group dropdown">
    <button class="btn btn-default dropdown-toggle" type="button"
            data-toggle="dropdown"
            aria-haspopup="true" aria-expanded="true">
        <span value="0" id="j_ticket" count="0">选择票种</span>
        <span class="caret"></span>
    </button>
    <ul class="dropdown-menu" id="j_ticket_type_selector">
    <#list sku.tickets as ticket>
        <li><a value="${ticket.id}" count="${ticket.count}">${ticket.name}</a></li>
    </#list>
    </ul>
    <a id="add_ticket"><span class="glyphicon glyphicon-plus-sign" aria-hidden="true"/></a>
</div>