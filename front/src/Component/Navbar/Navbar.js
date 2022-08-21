import React, { useImperativeHandle } from 'react';
import { Link,useMatch,useResolvedPath } from 'react-router-dom';
import './Navbar.css';

export default function Navbar() {
    return (
        <nav className="nav">
            <ul>
                <CustomLink to="/discovery">토픽</CustomLink>
                <CustomLink to="/ongoing">내 베팅</CustomLink>
                <CustomLink to="/leaderboard">랭킹</CustomLink>
                <CustomLink to="/profile">프로필</CustomLink>
            </ul>
        </nav>
    )
}

function CustomLink({ to, children, ...props}) {
    const resolvedPath = useResolvedPath(to)
    const isActive = useMatch({path: resolvedPath.pathname, end:true})
    return (
        <li className={isActive ? "active" : ""}>
            <Link to={to} {...props}>{children}</Link>
        </li>
    )
}